import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-form-cliente',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './form-cliente.component.html',
  styleUrls: ['./form-cliente.component.scss']
})
export class FormClienteComponent {
  nombre = '';
  correo = '';
  telefono = '';

  guardarCliente() {
    console.log('Cliente guardado:', { nombre: this.nombre, correo: this.correo, telefono: this.telefono });
    alert('Cliente guardado correctamente');
    // Aquí se puede integrar con un servicio para guardar en backend
  }
}
