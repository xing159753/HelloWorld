// console.log('hi');
// const getUserChoice = function getUserChoice(userInput) {
//     userInput = userInput.toLowerCase();
//     if(userInput === 'rock' || userInput === 'paper' || userInput === 'scissors'  || userInput === 'bomb') {
//         return userInput;
//     } else {
//         console.log('Error!')
//     }
// };
// console.log(getUserChoice('Paper'));
// console.log(getUserChoice('fork'));
// function getComputerChoice() {
//     let randomNumber = Math.floor(Math.random() * 3);
//     switch(randomNumber) {
//         case 0:
//             return 'rock';
//             break;
//         case 1 :
//             return 'paper';
//             break;
//         case 2 :
//             return 'scissors';
//             break;
//     }
//     return randomNumber
// }
// function determineWinner() {
//     if(userChoice === computerChoice) {
//         return 'The game is a tie!';
//     }
// }
//
// function determineWinner(userChoice,computerChoice) {
//     if(userChoice === 'bomb') {
//         return 'The user won!'
//     }
//     if(userChoice === 'rock') {
//         if(computerChoice === 'paper') {
//             return 'The computer won!'
//         } else {
//             return 'You won!'
//         }
//     }
//
//     if(userChoice === 'paper') {
//         if(computerChoice === 'scissors') {
//             return 'The computer won!'
//         } else {
//             return 'You won!'
//         }
//     }
//
//     if(userChoice === 'scissors') {
//         if(computerChoice === 'rock') {
//             return 'The computer won!'
//         } else {
//             return 'You won!'
//         }
//     }
// }
//
// console.log(determineWinner('paper', 'scissors'))
//
// function palyGame() {
//     let userChoice = getUserChoice('scissors');
//     let computerChoice = getComputerChoice();
//     console.log('You threw: '+ userChoice);
//     console.log('The computer threw:' + computerChoice);
//     console.log(determineWinner(userChoice,computerChoice))
// };
// palyGame()

const getUserChoice = userInput => {
    userInput = userInput.toLowerCase();
    if (userInput === 'rock' || userInput === 'scissors' || userInput === 'paper' || userInput === 'bomb') {
        return userInput;
    } else {
        console.log('Error, please type: rock, paper or scissors.');
    }
}

const getComputerChoice = () => {
    const randomNumber = Math.floor(Math.random() * 3);
    switch (randomNumber) {
        case 0:
            return 'rock';
        case 1:
            return 'paper';
        case 2:
            return 'scissors';
    }
};

const determineWinter = (userChoice, computerChoice) => {
    if (userChoice === computerChoice) {
        return 'This game is a tie!';
    }
    if (userChoice === 'rock') {
        if (computerChoice === 'paper'){
            return "Sorry, computer won!";
        } else {
            return "Congratulations, you won!";
        }
    }
    if (userChoice === 'paper') {
        if (computerChoice === 'scissors') {
            return "Sorry, computer won!";
        }else {
            return "Congratulations, you won!"
        }
    }
    if (userChoice === 'scissors') {
        if (computerChoice === 'rock') {
            return "Sorry,computer won!";
        } else {
            return "Congratulations, you won!";
        }
    }

    if (userChoice === 'bomb') {
        return 'Congratulations, you won!';
    }
};

// console.log(determineWinter('rock','scissors'));
// console.log(determineWinter('paper','scissors'));
// console.log(determineWinter('rock','rock'));

const playGame = () => {
    const userChoice = getUserChoice('bomb');
    const computerChoice = getComputerChoice();
    console.log('You threw: ' + userChoice);
    console.log('The computer threw: ' + computerChoice);
    console.log(determineWinter(userChoice, computerChoice));
};

playGame()

