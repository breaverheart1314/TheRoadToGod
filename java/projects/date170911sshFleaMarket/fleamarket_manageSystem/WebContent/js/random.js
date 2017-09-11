/**
 * http://usejsdoc.org/
 */
function produceOneRandom(b,e){   
    if(!b && b!=0 || !e){return "?";}   
    return Math.floor( ( Math.random() * e ) + b );   
}   