import math


def encryption(s):
    # Remove spaces e.g. "have a nice day" -> "haveaniceday"
    s = s.replace(" ", "")
    l = len(s)
    row = math.floor(math.sqrt(l))
    col = math.ceil(math.sqrt(l))

    # If row*col < l, then row = col
    if row * col < l:
        row = col

    # Create a grid with row and col
    # e.g. "haveaniceday" -> "have anic eday"
    result = ""

    # Loop through the grid and add space after each column
    # first loop through the column, then loop through the row
    for i in range(col):
        for j in range(row):
            # Check if i+j*col < l to avoid index out of range error
            # e.g. i = 3, j = 1, col = 4, row = 3, l = 12 -> 3+1*4 = 7 < 12
            if i + j * col < l:
                # Add each character to the result string
                # e.g. i = 3, j = 1, col = 4, row = 3, l = 12 -> 3+1*4 = 7 -> s[7] = "e"
                result += s[i + j * col]

        # This is to add space after each column
        # e.g. "have anic eday" -> "have anic eday "
        result += " "

    return result