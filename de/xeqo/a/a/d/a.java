package de.xeqo.a.a.d;

import android.util.Log;
import de.xeqo.a.a.d.a.d;
import de.xeqo.a.a.d.a.f;
import de.xeqo.a.a.d.a.t;
import de.xeqo.a.a.d.a.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class a extends c {
    public static c a(ByteBuffer byteBuffer) {
        c cVar = null;
        if (byteBuffer == null || byteBuffer.remaining() <= 8) {
            return null;
        }
        int i = byteBuffer.getInt();
        int i2 = byteBuffer.getInt();
        i -= 8;
        byte[] bArr = new byte[i];
        if (byteBuffer.remaining() < i) {
            return null;
        }
        byteBuffer.get(bArr);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        if (wrap != null) {
            switch (i2) {
                case 16384:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_Undefined");
                    break;
                case 16385:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_CancelTransaction");
                    break;
                case 16386:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_ObjectAdded");
                    break;
                case 16387:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_ObjectRemoved");
                    break;
                case 16388:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_StoreAdded");
                    break;
                case 16389:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_StoreRemoved");
                    break;
                case 16390:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_DevicePropChanged");
                    break;
                case 16391:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_ObjectInfoChanged");
                    break;
                case 16392:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_DeviceInfoChanged");
                    break;
                case 16393:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_RequestObjectTransfer");
                    break;
                case 16394:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_StoreFull");
                    break;
                case 16395:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_DeviceReset");
                    break;
                case 16396:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_StorageInfoChanged");
                    break;
                case 16397:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_CaptureComplete");
                    break;
                case 16398:
                    Log.d("CamCap_Lib", "EventCode: PTP_EC_UnreportedStatus");
                    break;
                case 49157:
                    Log.d("CamCap_Lib", "EventCode: CANON_EC_ExtendedErrorcode");
                    break;
                case 49160:
                    Log.d("CamCap_Lib", "EventCode: CANON_EC_ObjectInfoChanged");
                    break;
                case 49161:
                    Log.d("CamCap_Lib", "EventCode: CANON_EC_RequestObjectTransfer");
                    break;
                case 49164:
                    Log.d("CamCap_Lib", "EventCode: CANON_EC_CameraModeChanged");
                    break;
                case 49166:
                    Log.d("CamCap_Lib", "EventCode: CANON_EC_ShutterButtonPressed");
                    break;
                case 49169:
                    Log.d("CamCap_Lib", "EventCode: CANON_EC_StartDirectTransfer");
                    break;
                case 49171:
                    Log.d("CamCap_Lib", "EventCode: CANON_EC_StopDirectTransfer");
                    break;
                case 49409:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_RequestGetEvent");
                    break;
                case 49537:
                    cVar = w.a(wrap);
                    break;
                case 49538:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_ObjectRemoved");
                    break;
                case 49539:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_RequestGetObjectInfoEx");
                    break;
                case 49540:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_StorageStatusChanged");
                    break;
                case 49541:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_StorageInfoChanged");
                    break;
                case 49542:
                    cVar = f.a(wrap);
                    break;
                case 49543:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_ObjectInfoChangedEx");
                    break;
                case 49544:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_ObjectContentChanged");
                    break;
                case 49545:
                    cVar = d.a(wrap);
                    break;
                case 49546:
                    cVar = de.xeqo.a.a.d.a.a.a(wrap);
                    break;
                case 49547:
                    cVar = t.a(wrap);
                    break;
                case 49549:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_WillSoonShutdown");
                    break;
                case 49550:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_ShutdownTimerUpdated");
                    break;
                case 49551:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_RequestCancelTransfer");
                    break;
                case 49552:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_RequestObjectTransferDT");
                    break;
                case 49553:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_RequestCancelTransferDT");
                    break;
                case 49554:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_StoreAdded");
                    break;
                case 49555:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_StoreRemoved");
                    break;
                case 49556:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_BulbExposureTime");
                    break;
                case 49557:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_RecordingTime");
                    break;
                case 49570:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_RequestObjectTransferTS");
                    break;
                case 49571:
                    Log.d("CamCap_Lib", "EventCode: EOS_EC_AfResult");
                    break;
                default:
                    Log.d("CamCap_Lib", "EventCode: UNKNOWN EVENT CODE: " + i2);
                    break;
            }
        }
        return cVar == null ? new d() : cVar;
    }
}
