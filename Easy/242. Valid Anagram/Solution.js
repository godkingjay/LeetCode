var isAnagram = function (s, t) {
    let ss = Array.from(s);
    let tt = Array.from(t);
    ss.sort();
    tt.sort();
    if (ss.length !== tt.length) {
        return false;
    }
    for (let i = 0; i < s.length; i++) {
        if (ss[i] !== tt[i]) {
            return false;
        }
    }
    return true
};