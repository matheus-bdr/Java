const cars = ["celta","gol","fusca"] //array com 3 elementos
console.log(cars)

cars[3] = "mercedes";
console.log(cars); //Add elemento

const cars2 = new Array("celta","gol","fusca"); //criando um objero do tipo array
console.log(cars2);

console.log("------------------METODOS---------------------")

const a = ["banana","maca","manga"]
console.log(a.toString())

const b = ["celta","gol","fusca"]
console.log(b.join(" - "))

console.log("------------------POP---------------------")
//remove o ultimo elemento
const c = ["banana","maca","manga"]
console.log(c)
c.pop()
console.log(c)
console.log("------------------push---------------------")
//add no ultimo elemento
c.push("goiaba")
console.log(c)

console.log("------------------shift---------------------")
//remove no primeiro elemento 
c.shift()
console.log(c)
console.log(c.length) 

console.log("------------------sort---------------------")

const numeros = [1,2,3,4,5,6]
const comidas = ["lasanha","pizza","frutas","jantar","manga"]

numeros.reverse(function(a,b){return b-a})
comidas.reverse()
console.log(comidas)
console.log(numeros)

numeros.sort(function(a,b){return a-b})
comidas.sort()
console.log(comidas)
console.log(numeros)

console.log("------------------interation---------------------")

let percorrendoArrays = ["lasanha","pizza","frutas","jantar","manga"]
let num = [1,2,3,4,5,6]
percorrendoArrays.forEach(function(percorrendoArrays){
    console.log(percorrendoArrays)
})

let dobro = num.map(function(num){
    return (num*2)
})
console.log(num)
console.log(dobro)

let total = num.reduce(function(total, num) {
    return total + num    
}, 0)
console.log(total)




