nome = "Matheus";
var n = "Matheus da Cruz Santos";
let frutas = "maça, banana, coco";
let frutas2 = "maça, banana, coco";

console.log(typeof(nome));
console.log(nome);
console.log(nome.length);

console.log("_____________SEPARANDO_______________")
//fatiamento de strings 
console.log(frutas.slice(5,12));
//banana
console.log(frutas2.substring(5,12));
//banana

console.log("________MODIFICANDO STRINGS_________")
console.log(nome.toLowerCase());
console.log(nome.toUpperCase());

console.log("________BUSCAS EM STRINGS_________")

console.log(n.indexOf("Cruz")); 
console.log(n.lastIndexOf("Cruz")); 
console.log(n.search("Cruz"));

console.log(n.match(/th/g)); //quantas vezes th é encontrado
console.log(n.includes("Santos")) //tem "santos"?

console.log("________QUEBRA DE LINHA_________")

let quebraLinha = `bom dia ${nome}!
seja bem vindo!`

console.log(quebraLinha);