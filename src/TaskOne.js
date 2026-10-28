function getShortestWord(sentence) {

    if (sentence == null || sentence.trim() === "") {
        return "";
    }

    let words = sentence.trim().split(/\s+/);
    let shortest = words[0];

    for (let count = 1; count < words.length; count++) {
        if (words[count].length < shortest.length) {
            shortest = words[count];
        }
    }

    return shortest;
}

console.log(getShortestWord("JavaScript is a programming language"));