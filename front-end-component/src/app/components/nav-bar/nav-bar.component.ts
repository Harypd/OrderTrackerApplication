import { Component, OnInit, ViewEncapsulation } from "@angular/core";
import { NavigationEnd, Router } from "@angular/router";

@Component({
  selector: "app-nav-bar",
  templateUrl: "./nav-bar.component.html",
  styleUrls: ["./nav-bar.component.scss"],
  encapsulation: ViewEncapsulation.None,
})
export class NavBarComponent implements OnInit {
  navbarOpen = false;
  dropdownOpen = false;

  constructor(private _router: Router) {
    _router.events
      .subscribe((val) => {
        if(val instanceof NavigationEnd) {
          this.dropdownOpen = false;
        }
      });
  }
  ngOnInit() {}

  toggleNavbar() {
    this.navbarOpen = !this.navbarOpen;
  }

  dropdownToggle() {
    if (this.navbarOpen) {
      this._router.navigate([`details/198771/null`]);
    } else {
      this.dropdownOpen = !this.dropdownOpen;
    }
  }

  openOrderStatus() {
    this._router.navigate([`details/198771/null`]);
  }
}
