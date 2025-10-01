import { Routes } from '@angular/router';

// Features Autos
import { ListaAutosComponent } from './features/autos/lista-autos/lista-autos.component';
import { DetalleAutoComponent } from './features/autos/detalle-auto/detalle-auto.component';

// Features Clientes
import { ListaClientesComponent } from './features/clientes/lista-clientes/lista-clientes.component';
import { FormClienteComponent } from './features/clientes/form-cliente/form-cliente.component';

// Features Ventas
import { ListaVentasComponent } from './features/ventas/lista-ventas/lista-ventas.component';
import { FormVentaComponent } from './features/ventas/form-venta/form-venta.component';

export const routes: Routes = [
  { path: '', redirectTo: 'autos', pathMatch: 'full' },
  { path: 'autos', component: ListaAutosComponent },
  { path: 'autos/:id', component: DetalleAutoComponent },
  { path: 'clientes', component: ListaClientesComponent },
  { path: 'clientes/nuevo', component: FormClienteComponent },
  { path: 'ventas', component: ListaVentasComponent },
  { path: 'ventas/nueva', component: FormVentaComponent },
  { path: '**', redirectTo: 'autos' }
];
