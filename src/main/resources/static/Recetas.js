function showRecipe(recipeName) {
    const recipeContents = document.querySelectorAll(".recipe-content");

    recipeContents.forEach(content => {
        content.style.display = "none";
    });

    const selectedRecipe = document.getElementById(recipeName);
    selectedRecipe.style.display = "block";
}
