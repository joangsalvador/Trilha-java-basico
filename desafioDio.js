let heroi = "hulk";
let xp = "prata";


switch (heroi) {

  case "Ferro":
    console.log("Se XP for menor do que 1.000");
    break;

  case "Bronze":
    console.log("Se XP for entre 1.001 e 2.000");
    break;

  case "Prata":
    console.log("Se XP for entre 2.001 e 5.000");
    break;

  case "Ouro":
    console.log("Se XP for entre 6.001 e 7.000");
    break;

  case "Platina":
    console.log("Se XP for entre 7.001 e 8.000");
    break;

  case "Ascendente":
    console.log("Se XP for entre 8.001 e 9.000");
    break;

  case "Imortal":
    console.log("Se XP for entre 9.001 e 10.000");
    break;

  case "Radiante":
    console.log("Se XP for maior ou igual a 10.001");
    
    break;


  default:
    console.log(`O Herói de nome ${heroi} está no nível de ${xp}`);
    break;
}
