const AC_GAME_OBJECTS = [];
export class AcGameObject{
    constructor() {
        AC_GAME_OBJECTS.push(this);
        this.timedelta = 0;
        this.has_called_start = false;
    }
    start() {
        //只执行一次

    }
    updated() {
        
    }
    on_destroy() {
        //删除之前执行

    }

    destroyed() {
        this.on_destroy();
        for (let i in AC_GAME_OBJECTS) {
            const obj = AC_GAME_OBJECTS[i];
            if (obj === this) {
                AC_GAME_OBJECTS.splice(i);
                break;
            }
        }   
    }
}
const step = () => {
    requestAnimationFrame(step)
}
requestAnimationFrame(step)