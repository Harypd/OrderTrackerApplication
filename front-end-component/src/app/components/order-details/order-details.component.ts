import { Component, OnInit } from "@angular/core";
import { ActivatedRoute, Router } from "@angular/router";
import { OrderDetailsService } from "src/app/services/order-details.service";

@Component({
  selector: "app-order-details",
  templateUrl: "./order-details.component.html",
  styleUrls: ["./order-details.component.scss"],
})
export class OrderDetailsComponent implements OnInit {
  order: any;
  selectedItemId: string;
  orderId: string;
  selectedItem: any;

  constructor(
    private _router: Router,
    private route: ActivatedRoute,
    private _orderDetailsService: OrderDetailsService
  ) {
    this.orderId = this.route.snapshot.paramMap.get("orderid");
    this.selectedItemId = this.route.snapshot.paramMap.get("itemid");
  }

  ngOnInit() {
    this.loadOrderDetails();
  }

  loadOrderDetails() {
    this._orderDetailsService.getOrderDetails(198771).then((data) => {
      this.order = data;
      this.setSelectedItem();
    });
  }

  setSelectedItem() {
    if(this.selectedItemId !== 'null') {
      this.selectedItem = this.order.items.find(
        (item) => item.id == this.selectedItemId
      );
    } else {
      this.selectedItemId = this.order.items[0].id;
      this.selectedItem = this.order.items.find(
        (item) => item.id == this.selectedItemId
      );
      this._router.navigate([`details/198771/${this.selectedItemId}`]);
    }

    console.log('this.selectedItem', this.selectedItem);

  }

  itemChanged(id) {
    this.selectedItemId = id;
    this._router.navigate([`details/198771/${id}`]);
    this.setSelectedItem();
  }

  isNewShipDate() {
    return (
      this.selectedItem &&
      this.selectedItem.status === "ordered" &&
      !this.selectedItem.userAcceptedDelay &&
      (this.selectedItem.estimatedShipDateRange.fromDate !==
        this.selectedItem.newEstimatedShipDateRange.fromDate ||
        this.selectedItem.estimatedShipDateRange.toDate !==
          this.selectedItem.newEstimatedShipDateRange.toDate)
    );
  }

  acceptNewShipDate() {
    this.selectedItem.userAcceptedDelay = true;
    const payload = {
      estimatedShipDateRange: this.selectedItem.estimatedShipDateRange,
      newEstimatedShipDateRange: this.selectedItem.newEstimatedShipDateRange,
    };
    this._orderDetailsService
      .acceptNewShipDate("198771", this.selectedItemId, payload)
      .subscribe((response) => {
        this.loadOrderDetails();
      });
  }

  cancelItem() {
    this._orderDetailsService
      .cancelItem("198771", this.selectedItemId)
      .subscribe((response) => {
        this.loadOrderDetails();
        alert('Your order cancelled successfully');
      });
  }
}
