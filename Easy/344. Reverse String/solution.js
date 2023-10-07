//solution 1
const reverseString = function(s) {
    return s.reverse()
};
 
// solution 2 
// this solution got error about memory excceded, but this is a another way to do
// This solution not accepted in leetcode but it's work fine
const reverseString = function(s) {
    let res = []
    for(let i  = s.length -1; i >= 0 ; i--) {
        res.push(s[i])
    }

    return res
};

//solution 3
//this is 2 pointer solution
const reverseString = function(s) {
    let left = 0;
    let right = s.length - 1 ;

    while(left < right){
        const temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        left += 1;
        right -= 1;
    }

    return s;
};