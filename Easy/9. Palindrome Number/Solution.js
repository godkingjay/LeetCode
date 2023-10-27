var isPalindrome = function(x) {
    x = x.toString(); // Convert the input to a string
    return x === x.split('').reverse().join('');
};
