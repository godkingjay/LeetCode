/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    s = s.trim();
    
    
    const words = s.split(" ");
    return words[words.length - 1].length;
  };
  
  const input1 = "Hello World";
  const input2 = "Welcome to Hacktoberfest ";
  const input3 = "luffy is still joyboy";
  
  console.log(lengthOfLastWord(input1)); 
  console.log(lengthOfLastWord(input2)); 
  console.log(lengthOfLastWord(input3)); 
