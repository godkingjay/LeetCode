/**
 * @param {number} target
 * @param {number[]} position
 * @param {number[]} speed
 * @return {number}
 */

var carFleet = function (target, position, speed) {
  const n = position.length;
  if (n === 1) return 1;

  const cars = new Array(n);
  for (let i = 0; i < n; i++) cars[i] = i;
  cars.sort((a, b) => position[b] - position[a]);

  const timeNeeded = (carIndex) => {
    return (target - position[cars[carIndex]]) / speed[cars[carIndex]];
  };

  let counter = 1;
  let leader = 0;
  for (let i = 1; i < n; i++) {
    if (timeNeeded(i) > timeNeeded(leader)) {
      leader = i;
      counter++;
    }
  }
  return counter;
};
