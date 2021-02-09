import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { catchError, map, tap } from "rxjs/operators";

@Injectable({
  providedIn: "root",
})
export class OrderDetailsService {
  private _baseURL = "http://localhost:9999";
  constructor(private _http: HttpClient) {}

  getOrderDetails(orderId: number) {
    return new Promise((resolve, reject) => {
      this._http.get(this._baseURL + `/api/v1/orderstatus/order/${orderId}`).subscribe(async ({orderSummary}: any) => {
        for (let i = 0; i < orderSummary.items.length; i++) {
          orderSummary.items[i]["details"] = await this.getItemDetails(
            orderSummary.items[i].skuId
          );
        }
        resolve(orderSummary);
      });
    });
  }

  acceptNewShipDate(orderId: string, itemId: string, payload) {
    payload = {
      ...payload,
      delayAcceptedDate: new Date().toISOString(),
    };

    return this._http.post(
      this._baseURL +
        `/orderactions/acceptShipDate?orderId=${orderId}&itemId=${itemId}`,
      payload
    );
  }

  cancelItem(orderId: string, itemId: string) {
    const payload = {
      cancelReason: "User Cancelled",
      cancelDate: new Date().toISOString(),
    };

    return this._http.post(
      this._baseURL +
        `/api/v1/orderactions/cancelItem?orderId=${orderId}&itemId=${itemId}`,
      payload
    );
  }

  getItemDetails(skuId: string) {
    return new Promise((resolve, reject) => {
      this._http.get("assets/data/catalog.json").subscribe(
        // this._baseURL + `/catalog/sku/${skuId}`
        (data) => resolve(data),
        (error) => reject(error)
      );
    });
  }
}
