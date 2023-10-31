const intToRoman = (num) => {
	const numerals = {
		1: 'I',
		4: 'IV',
		5: 'V',
		9: 'IX',
		10: 'X',
		40: 'XL',
		50: 'L',
		90: 'XC',
		100: 'C',
		400: 'CD',
		500: 'D',
		900: 'CM',
		1000: 'M',
	};

	let romanized = '';
	const decimalKeys = Object.keys(numerals).reverse();

	decimalKeys.forEach((key) => {
		while (key <= num) {
			romanized = romanized + numerals[key];
			num = num - key;
		}
	});
	return romanized;
};

console.log(intToRoman(112));
