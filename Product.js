
function product(n)
{
    let p = 1;

    while (n > 0)
    {
        p = p * (n % 10);
        n = Math.floor(n / 10);
    }

    return p;
}

let num = 1234;
console.log("Product = " + product(num));
