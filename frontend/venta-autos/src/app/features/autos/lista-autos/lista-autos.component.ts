import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AutosService, Auto } from '../autos.service';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-lista-autos',
  standalone: true,
  imports: [CommonModule, RouterModule],
  templateUrl: './lista-autos.component.html',
  styleUrls: ['./lista-autos.component.scss']
})
export class ListaAutosComponent implements OnInit {
  autos: Auto[] = [];

  constructor(private autosService: AutosService) {}

  ngOnInit(): void {
    this.autos = this.autosService.getAutos();
  }
}
