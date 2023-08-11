/**
 * 
 */
 
 $(document).ready(function() {
    $('#loginForm').submit(function(e) {
        e.preventDefault();
        
        // Perform client-side validation
        var username = $('input[name="username"]').val();
        var password = $('input[name="password"]').val();
        
        if (username === '' || password === '') {
            alert('Both username and password are required.');
        } else {
            // Submit the form if validation passes
            this.submit();
        }
    });
});
