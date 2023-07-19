class CalculadoraImc {
    constructor() {
        this.btnCalcular = document.getElementById('btn_calcular');
        this.resultado = document.getElementById('resultado');
        this.btnCalcular.addEventListener('click', this.calculandoIMC.bind(this));
    }

    calculandoIMC() {
        let peso = document.getElementById('peso').value;
        let altura = document.getElementById('altura').value / 100;

        if (altura !== '' && peso !== '') {
            let imc = (peso / (altura * altura)).toFixed(2);
            let mensaje = '';

            if (imc < 18.5) {
                mensaje = '¡Por debajo del peso!';
            } else if (imc < 25) {
                mensaje = '¡Estás en el peso ideal!';
            } else if (imc < 30) {
                mensaje = '¡Estás ligeramente por encima del peso!';
            } else if (imc < 35) {
                mensaje = '¡Cuidado! Obesidad grado I';
            } else if (imc < 40) {
                mensaje = '¡Cuidado! Obesidad grado II';
            } else {
                mensaje = '¡Cuidado! Obesidad grado III';
            }

            this.resultado.textContent = `¡Tu IMC es ${imc}! ${mensaje}`;
        } else {
            this.resultado.textContent = '¡Completa todos los campos!';
        }
    }
}

const calculadora = new CalculadoraImc();

//prueba para ver si sirve 