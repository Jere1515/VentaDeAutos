import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CommonModule } from '@angular/common';
import { AutosService, Auto } from '../autos.service';

@Component({
  selector: 'app-detalle-auto',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './detalle-auto.component.html',
  styleUrls: ['./detalle-auto.component.scss']
})
export class DetalleAutoComponent implements OnInit {
  auto: Auto | undefined;

  constructor(
    private route: ActivatedRoute,
    private autosService: AutosService
  ) {}

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.auto = this.autosService.getAutoById(id);
  }
}
