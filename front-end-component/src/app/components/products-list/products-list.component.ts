import { Component, EventEmitter, Input, OnInit, Output } from "@angular/core";

@Component({
  selector: "app-products-list",
  templateUrl: "./products-list.component.html",
  styleUrls: ["./products-list.component.scss"],
})
export class ProductsListComponent implements OnInit {
  @Input() items;
  @Input() selected: number;
  @Output("itemChanged") itemChanged = new EventEmitter();

  constructor() {}

  ngOnInit() {}

  navigateTo(id) {
    this.itemChanged.emit(id);
  }
}
