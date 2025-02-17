function toggleDescription(element) {
    let description = element.querySelector('.description');
    description.style.display = description.style.display === 'block' ? 'none' : 'block';
}
function toggleDescription(button) {
    const description = button.closest('.animal').querySelector('.description');

    if (button.classList.contains('view')) {
        // Show the description when the "view" button is clicked
        description.style.display = 'block';
    } else if (button.classList.contains('close')) {
        // Hide the description when the "close" button is clicked
        description.style.display = 'none';
    }
}
