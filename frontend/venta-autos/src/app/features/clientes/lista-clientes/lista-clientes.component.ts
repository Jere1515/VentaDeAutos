import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';

interface Cliente {
  id: number;
  nombre: string;
  correo: string;
  telefono: string;
}

@Component({
  selector: 'app-lista-clientes',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './lista-clientes.component.html',
  styleUrls: ['./lista-clientes.component.scss']
})
export class ListaClientesComponent implements OnInit {
  clientes: Cliente[] = [];

  constructor() {}

  ngOnInit(): void {
    // Datos de ejemplo
    this.clientes = [
      { id: 1, nombre: 'Juan Pérez', correo: 'juan@mail.com', telefono: '987654321' },
      { id: 2, nombre: 'María López', correo: 'maria@mail.com', telefono: '912345678' }
    ];
  }
}
