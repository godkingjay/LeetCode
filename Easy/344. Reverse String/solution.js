//solution 1
const reverseString = function(s) {
    return s.reverse()
};

//solution 2
const reverseString = function(s) {
    let res = []
    for(let i  = s.length -1; i >= 0 ; i--) {
        res.push(s[i])
    }

    return res
};