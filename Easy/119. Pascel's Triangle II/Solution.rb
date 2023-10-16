def get_row(r)
    return [1] if r == 0
    ans = [1]
    temp = 1
    for i in 1...r do
        temp = temp * (r - i + 1) / i
        ans << temp
    end
    ans << 1
    return ans
end

def main
    row_number = 5  # You can change this to the desired row number
    result = get_row(row_number)
    puts "#{result}"
end

main  # Call the main function to execute the code
