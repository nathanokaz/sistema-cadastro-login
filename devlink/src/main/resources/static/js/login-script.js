const form = document.querySelector('#login-form');

const email = document.querySelector('#email-input');
const senha = document.querySelector('#password-input');

form.addEventListener('submit', function(event) {
    event.preventDefault();

    const input1 = validate(email, 'Email obrigatório.', document.querySelector('#label-email'), document.querySelector('#error-email'));
    const input2 = validate(senha, 'Senha obrigatória.', document.querySelector('#label-password'), document.querySelector('#error-password'));

    if (input1 && input2) {
        form.submit();
    }
})

function validate(input, message, label, error) {
    const inputValue = input.value.trim();
    const isInvalid = isEmpty(inputValue);

    error.textContent = isInvalid ? message : '';

    input.classList.toggle('inputError', isInvalid);
    label.classList.toggle('labelError', isInvalid);

    input.classList.toggle('inputAccept', !isInvalid);
    label.classList.toggle('labelAccept', !isInvalid);

    return !isInvalid;
}

function isEmpty(input) {
    return input === '' ? true : false;
}