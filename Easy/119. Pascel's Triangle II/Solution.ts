function getRow(r: number): number[] {
    var ans:number[] = [1]
    var temp:number = 1
    for(var i:number=1;i<=r;i++){
        temp = temp*(r-i+1)/i
        ans.push(temp)
    }
    return ans
};

let r = 5
console.log(getRow(r))