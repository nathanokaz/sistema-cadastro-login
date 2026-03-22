const form = document.querySelector('#register-form');

const nameInput = document.querySelector('#name-input');
const username = document.querySelector('#nickname-input');
const email = document.querySelector('#email-input');
const senha = document.querySelector('#password-input');

form.addEventListener('submit', function(event) {
    event.preventDefault();

    const input1 = validate(nameInput, 'Nome obrigatório.', document.querySelector('#label-name'), document.querySelector('#error-name'));
    const input2 = validate(username, 'Username obrigatório.', document.querySelector('#label-username'), document.querySelector('#error-username'));
    const input3 = validate(email, 'Email obrigatório.', document.querySelector('#label-email'), document.querySelector('#error-email'));
    const input4 = validate(senha, 'Senha obrigatória.', document.querySelector('#label-password'), document.querySelector('#error-password'));

    if (input1 && input2 && input3 && input4) {
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