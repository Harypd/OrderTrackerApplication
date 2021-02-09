import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { HttpClientModule } from "@angular/common/http";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { NavBarComponent } from "./components/nav-bar/nav-bar.component";
import { ClickOutsideDirective } from "./directives/click-outside.directive";
import { HomeComponent } from "./components/home/home.component";
import { OrderDetailsComponent } from "./components/order-details/order-details.component";
import { OrderStatusComponent } from "./components/order-status/order-status.component";
import { ProductsListComponent } from "./components/products-list/products-list.component";

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    ClickOutsideDirective,
    HomeComponent,
    OrderDetailsComponent,
    OrderStatusComponent,
    ProductsListComponent,
  ],
  imports: [BrowserModule, HttpClientModule, AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
