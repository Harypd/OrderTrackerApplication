import { Component, Input, OnInit } from "@angular/core";

@Component({
  selector: "app-order-status",
  templateUrl: "./order-status.component.html",
  styleUrls: ["./order-status.component.scss"],
})
export class OrderStatusComponent implements OnInit {
  @Input() status;
  @Input() complete;
  @Input() size = "large";

  constructor() {}

  ngOnInit() {}

  getSizeClass() {
    return this.size;
  }
}
