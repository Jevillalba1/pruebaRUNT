import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProfesoresComponent } from './pages/profesores/profesores.component';
import { ProfesorDetallesComponent } from './pages/profesor-detalles/profesor-detalles.component';
import { NavbarComponent } from './pages/main/navbar/navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    ProfesoresComponent,
    ProfesorDetallesComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
