function showRecipe(recipeType) {
    // Oculta todos los contenidos de las recetas
    var recipeContents = document.getElementsByClassName("recipe-content");
    for (var i = 0; i < recipeContents.length; i++) {
        recipeContents[i].style.display = "none";
    }

    // Muestra el contenido de la receta seleccionada
    var recipeToShow = document.getElementById(recipeType);
    recipeToShow.style.display = "block";
}
