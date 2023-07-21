document.getElementById('nuevoTemaForm').addEventListener('submit', function (event) {
    event.preventDefault();

    // Obtener los valores ingresados por el usuario
    const nombre = document.getElementById('nombre').value;
    const tema = document.getElementById('tema').value;
    const comentario = document.getElementById('comentario').value;

    // Crear un nuevo elemento de comentario
    const nuevoComentario = document.createElement('li');
    nuevoComentario.innerHTML = `
    <span class="nombre-usuario">${nombre}</span>
    <span class="tema">${tema}</span>
    <p class="comentario">${comentario}</p>
  `;

    // Agregar el nuevo comentario a la lista de comentarios
    document.getElementById('listaComentarios').appendChild(nuevoComentario);

    // Limpiar los campos del formulario
    document.getElementById('nombre').value = '';
    document.getElementById('tema').value = '';
    document.getElementById('comentario').value = '';
});
