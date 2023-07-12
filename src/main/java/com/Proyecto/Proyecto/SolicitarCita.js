document.getElementById('solicitudCitaForm').addEventListener('submit', function (event) {
    event.preventDefault();

    // Obtener los valores ingresados por el usuario
    const nombre = document.getElementById('nombre').value;
    const asunto = document.getElementById('asunto').value;
    const comentario = document.getElementById('comentario').value;

    // Crear un nuevo elemento de cita solicitada
    const nuevaCita = document.createElement('li');
    nuevaCita.innerHTML = `
    <span class="nombre-usuario">${nombre}</span>
    <span class="tema">Asunto: ${asunto}</span>
    <p class="comentario">${comentario}</p>
  `;

    // Agregar la nueva cita solicitada a la lista de citas
    document.getElementById('listaCitas').appendChild(nuevaCita);

    // Limpiar los campos del formulario
    document.getElementById('nombre').value = '';
    document.getElementById('asunto').value = '';
    document.getElementById('comentario').value = '';
});
