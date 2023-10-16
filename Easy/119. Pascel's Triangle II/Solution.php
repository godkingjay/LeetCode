class Solution {
    function getRow($r) {
        $ans = array(1);
        $temp = 1;
        for ($i = 1; $i <= $r; $i++) {
            $temp = $temp * ($r - $i + 1) / $i;
            array_push($ans, $temp);
        }
        return $ans;
    }
}

function main() {
    $solution = new Solution();
    $rowNumber = 5;  // You can change this to the desired row number
    $result = $solution->getRow($rowNumber);
    echo "[" . implode(', ', $result) . "]\n";
}

main();  // Call the main function to execute the code
