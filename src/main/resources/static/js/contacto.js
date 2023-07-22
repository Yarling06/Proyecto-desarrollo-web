document.getElementById("contact-form").addEventListener("submit", function (event) {
    event.preventDefault();
    document.getElementById("thank-you").style.display = "block";
    this.reset();
});
