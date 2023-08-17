document.getElementById('appointment-form').addEventListener('submit', function (event) {
    event.preventDefault();

    // Obtener los valores ingresados por el usuario
    const nombre = document.getElementById('name').value;
    const asunto = document.getElementById('reason').value;
    const fechaPreferencia = document.getElementById('preferred-date').value;

    // Crear un nuevo elemento de cita solicitada
    const nuevaCita = document.createElement('li');
    nuevaCita.innerHTML = `
    <span class="nombre-usuario">${nombre}</span>
    <span class="tema">Asunto: ${asunto}</span>
    <span class="fecha">Fecha de preferencia: ${fechaPreferencia}</span>
  `;

    // Agregar la nueva cita solicitada a la lista de citas
    document.getElementById('listaCitas').appendChild(nuevaCita);

    // Limpiar los campos del formulario
    document.getElementById('name').value = '';
    document.getElementById('reason').value = '';
    document.getElementById('preferred-date').value = '';
});
