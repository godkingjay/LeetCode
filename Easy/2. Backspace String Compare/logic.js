// Backspace String Compare Logic Starts Here
const backspaceCompare = (s, t) => {
  const getNextValidCharIndex = (str, index) => {
    let backspaceCount = 0;
    while (index >= 0) {
      if (str[index] === "#") {
        backspaceCount++;
        index--;
      } else if (backspaceCount > 0) {
        backspaceCount--;
        index--;
      } else {
        break;
      }
    }
    return index;
  };

  let sPointer = s.length - 1;
  let tPointer = t.length - 1;

  while (sPointer >= 0 || tPointer >= 0) {
    sPointer = getNextValidCharIndex(s, sPointer);
    tPointer = getNextValidCharIndex(t, tPointer);

    if (sPointer < 0 && tPointer < 0) {
      return true;
    }

    if (sPointer < 0 || tPointer < 0 || s[sPointer] !== t[tPointer]) {
      return false;
    }

    sPointer--;
    tPointer--;
  }

  return true;
};
