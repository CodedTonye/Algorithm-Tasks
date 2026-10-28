function getSortedSquaredArray(array) {

    for (let count = 0; count < array.length; count++) {
        array[count] = array[count] * array[count];

        for (let counter = 0; counter < array.length; counter++) {
            if (array[count] < array[counter]) {
                let temp = array[count];
                array[count] = array[counter];
                array[counter] = temp;
            }
        }
    }
    return array;

}

const numbers = [3, 2, 7, 1, 4];

console.log(getSortedSquaredArray(numbers));