import { Injectable } from '@angular/core';

export interface Auto {
  id: number;
  marca: string;
  modelo: string;
  anio: number;
  precio: number;
}

@Injectable({
  providedIn: 'root'
})
export class AutosService {
  private autos: Auto[] = [
    { id: 1, marca: 'Toyota', modelo: 'Corolla', anio: 2020, precio: 15000 },
    { id: 2, marca: 'Honda', modelo: 'Civic', anio: 2019, precio: 14000 },
    { id: 3, marca: 'Ford', modelo: 'Focus', anio: 2021, precio: 16000 },
    { id: 4, marca: 'Chevrolet', modelo: 'Cruze', anio: 2018, precio: 13000 }
  ];

  constructor() {}

  getAutos(): Auto[] {
    return this.autos;
  }

  getAutoById(id: number): Auto | undefined {
    return this.autos.find(auto => auto.id === id);
  }
}
