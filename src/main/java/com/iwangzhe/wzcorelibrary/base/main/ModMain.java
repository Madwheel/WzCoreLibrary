package com.iwangzhe.wzcorelibrary.base.main;

import com.iwangzhe.wzcorelibrary.base.EAppPhase;
import com.iwangzhe.wzcorelibrary.base.EModStatus;
import com.iwangzhe.wzcorelibrary.base.MyObject;

/**
 * author : 亚辉
 * e-mail : 2372680617@qq.com
 * date   : 2020/9/211:43
 * desc   :
 */
public abstract class ModMain extends MyObject {
    public abstract String getModName();

    protected ModMain() {
    }

    protected EModStatus mStatus = EModStatus.UNCREATE;
    protected EAppPhase mPhase = EAppPhase.APP_PHASE_BORN;

    @Override
    public void born() {
        super.born();
        mStatus = EModStatus.CREATE;
    }

    @Override
    public void create() {
        super.create();
        mStatus = EModStatus.INIT;
    }

    @Override
    public void active() {
        super.active();
        mStatus = EModStatus.ACTIVE;
    }

    @Override
    public void deactive() {
        super.deactive();
        mStatus = EModStatus.DEACTIVE;
    }

    @Override
    public void destroy() {
        super.destroy();
        mStatus = EModStatus.DESTROY;
    }

    @Override
    public void terminate() {
        super.terminate();
        mStatus = EModStatus.TERMINATE;
    }

    public void phase(EAppPhase phase) {
        mPhase = phase;
    }
}
