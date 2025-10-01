import { Component, OnInit } from '@angular/core';
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
  selector: 'app-lista-ventas',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './lista-ventas.component.html',
  styleUrls: ['./lista-ventas.component.scss']
})
export class ListaVentasComponent implements OnInit {
  ventas: Venta[] = [];

  ngOnInit() {
    // Datos de ejemplo
    this.ventas = [
      { 
        id: 1, 
        cliente: { id: 1, nombre: 'Juan' }, 
        auto: { id: 1, marca: 'Toyota', modelo: 'Corolla', anio: 2020, precio: 15000 }, 
        fecha: '2025-09-30' 
      }
    ];
  }
}
