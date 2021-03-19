import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

/** Components */
import { ProfesoresComponent } from "../app/pages/profesores/profesores.component";
import { ProfesorDetallesComponent } from "../app/pages/profesor-detalles/profesor-detalles.component";

const routes: Routes = [
  { path: 'profesores', component: ProfesoresComponent },
  { path: 'profesores/detalle/:profesorid', component: ProfesorDetallesComponent },
  { path: '**', redirectTo: '/profesores', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
