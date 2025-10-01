import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

interface Cliente {
  id: number;
  nombre: string;
}

interface Auto {
  id: number;
  marca: string;
  modelo: string;
  anio: number;
  precio: number;
}

interface Venta {
  id: number;
  cliente: Cliente;
  auto: Auto;
  fecha: string;
}

@Component({
  selector: 'app-form-venta',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './form-venta.component.html',
  styleUrls: ['./form-venta.component.scss']
})
export class FormVentaComponent {
  clientes: Cliente[] = [
    { id: 1, nombre: 'Juan' },
    { id: 2, nombre: 'María' }
  ];

  autos: Auto[] = [
    { id: 1, marca: 'Toyota', modelo: 'Corolla', anio: 2020, precio: 15000 },
    { id: 2, marca: 'Honda', modelo: 'Civic', anio: 2019, precio: 14000 }
  ];

  venta: Venta = { 
    id: 0, 
    cliente: this.clientes[0], 
    auto: this.autos[0], 
    fecha: '' 
  };

  guardarVenta() {
    console.log('Venta registrada:', this.venta);
    alert('Venta registrada correctamente');
    // Aquí luego podrías enviarlo a un Service para persistir en backend
  }
}
