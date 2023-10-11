const announceThatIAmDoingImportantWork = () => {
    console.log("I’m doing very important work!");
};

const busy = announceThatIAmDoingImportantWork;

busy(); // This function call barely takes any space!

const higherOrderFunc = param => {
    param();
    return `I just invoked ${param.name} as a callback function!`
}

const anotherFunc = () => {
    return 'I\'m being invoked by the higher-order function!';
}

higherOrderFunc(anotherFunc);


higherOrderFunc(() => {
    for (let i = 0; i <= 10; i++){
        console.log(i);
    }
});
