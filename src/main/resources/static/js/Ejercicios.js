function showRoutine(routineName) {
    const routineContents = document.querySelectorAll(".routine-content");

    routineContents.forEach(content => {
        content.style.display = "none";
    });

    const selectedRoutine = document.getElementById(routineName);
    selectedRoutine.style.display = "block";
}

