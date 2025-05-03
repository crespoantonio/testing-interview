function exerciseI() {
    const arr = [1, 2, 3, 4, 5];
    const n = arr.length;
  
    for (let i = 0; i < Math.floor(n / 2); i++) {
      let temp = arr[i];
      arr[i] = arr[n - i - 1];
      arr[n - i - 1] = temp;
    }
  
    console.log(arr.join(" "));
  }
  
function exerciseII() {
  const arr = [2, 4, 6, 8, 10];
  let result = 0;

  for (let i = 0; i < arr.length; i++) {
    if (i % 2 === 0) {
      result += arr[i];
    } else {
      result -= arr[i];
    }
  }

  console.log(result);
}
