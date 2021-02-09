import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { OrderDetailsComponent } from './components/order-details/order-details.component';


const routes: Routes = [
  { path: '', component: HomeComponent},
  { path: 'details/:orderid/:itemid', component: OrderDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
