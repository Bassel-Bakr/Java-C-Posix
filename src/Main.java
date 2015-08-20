
import java.lang.reflect.Field;





public class Main implements Thread.UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread p1, Throwable p2) {
		// TODO: Implement this method
		p2.printStackTrace();
		System.exit(0);
	}
	

	public static void main(String... args) throws Exception {
		Thread.setDefaultUncaughtExceptionHandler(new Main());
		C.kill(C.getpid(), C.SIGABRT);
	}

	public static <T> T getStaticField(Class<?> c, String name) {
		Field f = null;
		try {
			f = c.getDeclaredField(name);
		} catch (Exception e) {
			try {
				f = c.getDeclaredField(name);
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		}
		if (f != null) {
			f.setAccessible(true);
			try {
				return (T) f.get(null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}


	public static class Hidden {
		public Hidden() {}

		private int half(int x) {
			return x / 2;
		}
	}



	static interface Constants {
		int AF_INET,
		AF_INET6,
		AF_UNIX,
		AF_UNSPEC,
		AI_ADDRCONFIG,
		AI_ALL,
		AI_CANONNAME,
		AI_NUMERICHOST,
		AI_NUMERICSERV,
		AI_PASSIVE,
		AI_V4MAPPED,
		CAP_AUDIT_CONTROL,
		CAP_AUDIT_WRITE,
		CAP_BLOCK_SUSPEND,
		CAP_CHOWN,
		CAP_DAC_OVERRIDE,
		CAP_DAC_READ_SEARCH,
		CAP_FOWNER,
		CAP_FSETID,
		CAP_IPC_LOCK,
		CAP_IPC_OWNER,
		CAP_KILL,
		CAP_LAST_CAP,
		CAP_LEASE,
		CAP_LINUX_IMMUTABLE,
		CAP_MAC_ADMIN,
		CAP_MAC_OVERRIDE,
		CAP_MKNOD,
		CAP_NET_ADMIN,
		CAP_NET_BIND_SERVICE,
		CAP_NET_BROADCAST,
		CAP_NET_RAW,
		CAP_SETFCAP,
		CAP_SETGID,
		CAP_SETPCAP,
		CAP_SETUID,
		CAP_SYSLOG,
		CAP_SYS_ADMIN,
		CAP_SYS_BOOT,
		CAP_SYS_CHROOT,
		CAP_SYS_MODULE,
		CAP_SYS_NICE,
		CAP_SYS_PACCT,
		CAP_SYS_PTRACE,
		CAP_SYS_RAWIO,
		CAP_SYS_RESOURCE,
		CAP_SYS_TIME,
		CAP_SYS_TTY_CONFIG,
		CAP_WAKE_ALARM,
		E2BIG,
		EACCES,
		EADDRINUSE,
		EADDRNOTAVAIL,
		EAFNOSUPPORT,
		EAGAIN,
		EAI_AGAIN,
		EAI_BADFLAGS,
		EAI_FAIL,
		EAI_FAMILY,
		EAI_MEMORY,
		EAI_NODATA,
		EAI_NONAME,
		EAI_OVERFLOW,
		EAI_SERVICE,
		EAI_SOCKTYPE,
		EAI_SYSTEM,
		EALREADY,
		EBADF,
		EBADMSG,
		EBUSY,
		ECANCELED,
		ECHILD,
		ECONNABORTED,
		ECONNREFUSED,
		ECONNRESET,
		EDEADLK,
		EDESTADDRREQ,
		EDOM,
		EDQUOT,
		EEXIST,
		EFAULT,
		EFBIG,
		EHOSTUNREACH,
		EIDRM,
		EILSEQ,
		EINPROGRESS,
		EINTR,
		EINVAL,
		EIO,
		EISCONN,
		EISDIR,
		ELOOP,
		EMFILE,
		EMLINK,
		EMSGSIZE,
		EMULTIHOP,
		ENAMETOOLONG,
		ENETDOWN,
		ENETRESET,
		ENETUNREACH,
		ENFILE,
		ENOBUFS,
		ENODATA,
		ENODEV,
		ENOENT,
		ENOEXEC,
		ENOLCK,
		ENOLINK,
		ENOMEM,
		ENOMSG,
		ENOPROTOOPT,
		ENOSPC,
		ENOSR,
		ENOSTR,
		ENOSYS,
		ENOTCONN,
		ENOTDIR,
		ENOTEMPTY,
		ENOTSOCK,
		ENOTSUP,
		ENOTTY,
		ENXIO,
		EOPNOTSUPP,
		EOVERFLOW,
		EPERM,
		EPIPE,
		EPROTO,
		EPROTONOSUPPORT,
		EPROTOTYPE,
		ERANGE,
		EROFS,
		ESPIPE,
		ESRCH,
		ESTALE,
		ETIME,
		ETIMEDOUT,
		ETXTBSY,
		EXDEV,
		EXIT_FAILURE,
		EXIT_SUCCESS,
		FD_CLOEXEC,
		FIONREAD,
		F_DUPFD,
		F_GETFD,
		F_GETFL,
		F_GETLK,
		F_GETLK64,
		F_GETOWN,
		F_OK,
		F_RDLCK,
		F_SETFD,
		F_SETFL,
		F_SETLK,
		F_SETLK64,
		F_SETLKW,
		F_SETLKW64,
		F_SETOWN,
		F_UNLCK,
		F_WRLCK,
		IFF_ALLMULTI,
		IFF_AUTOMEDIA,
		IFF_BROADCAST,
		IFF_DEBUG,
		IFF_DYNAMIC,
		IFF_LOOPBACK,
		IFF_MASTER,
		IFF_MULTICAST,
		IFF_NOARP,
		IFF_NOTRAILERS,
		IFF_POINTOPOINT,
		IFF_PORTSEL,
		IFF_PROMISC,
		IFF_RUNNING,
		IFF_SLAVE,
		IFF_UP,
		IPPROTO_ICMP,
		IPPROTO_ICMPV6,
		IPPROTO_IP,
		IPPROTO_IPV6,
		IPPROTO_RAW,
		IPPROTO_TCP,
		IPPROTO_UDP,
		IPV6_CHECKSUM,
		IPV6_MULTICAST_HOPS,
		IPV6_MULTICAST_IF,
		IPV6_MULTICAST_LOOP,
		IPV6_RECVDSTOPTS,
		IPV6_RECVHOPLIMIT,
		IPV6_RECVHOPOPTS,
		IPV6_RECVPKTINFO,
		IPV6_RECVRTHDR,
		IPV6_RECVTCLASS,
		IPV6_TCLASS,
		IPV6_UNICAST_HOPS,
		IPV6_V6ONLY,
		IP_MULTICAST_IF,
		IP_MULTICAST_LOOP,
		IP_MULTICAST_TTL,
		IP_TOS,
		IP_TTL,
		MAP_FIXED,
		MAP_PRIVATE,
		MAP_SHARED,
		MCAST_JOIN_GROUP,
		MCAST_LEAVE_GROUP,
		MCL_CURRENT,
		MCL_FUTURE,
		MSG_CTRUNC,
		MSG_DONTROUTE,
		MSG_EOR,
		MSG_OOB,
		MSG_PEEK,
		MSG_TRUNC,
		MSG_WAITALL,
		MS_ASYNC,
		MS_INVALIDATE,
		MS_SYNC,
		NI_DGRAM,
		NI_NAMEREQD,
		NI_NOFQDN,
		NI_NUMERICHOST,
		NI_NUMERICSERV,
		O_ACCMODE,
		O_APPEND,
		O_CREAT,
		O_EXCL,
		O_NOCTTY,
		O_NOFOLLOW,
		O_NONBLOCK,
		O_RDONLY,
		O_RDWR,
		O_SYNC,
		O_TRUNC,
		O_WRONLY,
		POLLERR,
		POLLHUP,
		POLLIN,
		POLLNVAL,
		POLLOUT,
		POLLPRI,
		POLLRDBAND,
		POLLRDNORM,
		POLLWRBAND,
		POLLWRNORM,
		PROT_EXEC,
		PROT_NONE,
		PROT_READ,
		PROT_WRITE,
		R_OK,
		SEEK_CUR,
		SEEK_END,
		SEEK_SET,
		SHUT_RD,
		SHUT_RDWR,
		SHUT_WR,
		SIGABRT,
		SIGALRM,
		SIGBUS,
		SIGCHLD,
		SIGCONT,
		SIGFPE,
		SIGHUP,
		SIGILL,
		SIGINT,
		SIGIO,
		SIGKILL,
		SIGPIPE,
		SIGPROF,
		SIGPWR,
		SIGQUIT,
		SIGRTMAX,
		SIGRTMIN,
		SIGSEGV,
		SIGSTKFLT,
		SIGSTOP,
		SIGSYS,
		SIGTERM,
		SIGTRAP,
		SIGTSTP,
		SIGTTIN,
		SIGTTOU,
		SIGURG,
		SIGUSR1,
		SIGUSR2,
		SIGVTALRM,
		SIGWINCH,
		SIGXCPU,
		SIGXFSZ,
		SIOCGIFADDR,
		SIOCGIFBRDADDR,
		SIOCGIFDSTADDR,
		SIOCGIFNETMASK,
		SOCK_DGRAM,
		SOCK_RAW,
		SOCK_SEQPACKET,
		SOCK_STREAM,
		SOL_SOCKET,
		SO_BINDTODEVICE,
		SO_BROADCAST,
		SO_DEBUG,
		SO_DONTROUTE,
		SO_ERROR,
		SO_KEEPALIVE,
		SO_LINGER,
		SO_OOBINLINE,
		SO_PASSCRED,
		SO_PEERCRED,
		SO_RCVBUF,
		SO_RCVLOWAT,
		SO_RCVTIMEO,
		SO_REUSEADDR,
		SO_SNDBUF,
		SO_SNDLOWAT,
		SO_SNDTIMEO,
		SO_TYPE,
		STDERR_FILENO,
		STDIN_FILENO,
		STDOUT_FILENO,
		S_IFBLK,
		S_IFCHR,
		S_IFDIR,
		S_IFIFO,
		S_IFLNK,
		S_IFMT,
		S_IFREG,
		S_IFSOCK,
		S_IRGRP,
		S_IROTH,
		S_IRUSR,
		S_IRWXG,
		S_IRWXO,
		S_IRWXU,
		S_ISGID,
		S_ISUID,
		S_ISVTX,
		S_IWGRP,
		S_IWOTH,
		S_IWUSR,
		S_IXGRP,
		S_IXOTH,
		S_IXUSR,
		TCP_NODELAY,
		WCONTINUED,
		WEXITED,
		WNOHANG,
		WNOWAIT,
		WSTOPPED,
		WUNTRACED,
		W_OK,
		X_OK,
		_SC_2_CHAR_TERM,
		_SC_2_C_BIND,
		_SC_2_C_DEV,
		_SC_2_C_VERSION,
		_SC_2_FORT_DEV,
		_SC_2_FORT_RUN,
		_SC_2_LOCALEDEF,
		_SC_2_SW_DEV,
		_SC_2_UPE,
		_SC_2_VERSION,
		_SC_AIO_LISTIO_MAX,
		_SC_AIO_MAX,
		_SC_AIO_PRIO_DELTA_MAX,
		_SC_ARG_MAX,
		_SC_ASYNCHRONOUS_IO,
		_SC_ATEXIT_MAX,
		_SC_AVPHYS_PAGES,
		_SC_BC_BASE_MAX,
		_SC_BC_DIM_MAX,
		_SC_BC_SCALE_MAX,
		_SC_BC_STRING_MAX,
		_SC_CHILD_MAX,
		_SC_CLK_TCK,
		_SC_COLL_WEIGHTS_MAX,
		_SC_DELAYTIMER_MAX,
		_SC_EXPR_NEST_MAX,
		_SC_FSYNC,
		_SC_GETGR_R_SIZE_MAX,
		_SC_GETPW_R_SIZE_MAX,
		_SC_IOV_MAX,
		_SC_JOB_CONTROL,
		_SC_LINE_MAX,
		_SC_LOGIN_NAME_MAX,
		_SC_MAPPED_FILES,
		_SC_MEMLOCK,
		_SC_MEMLOCK_RANGE,
		_SC_MEMORY_PROTECTION,
		_SC_MESSAGE_PASSING,
		_SC_MQ_OPEN_MAX,
		_SC_MQ_PRIO_MAX,
		_SC_NGROUPS_MAX,
		_SC_NPROCESSORS_CONF,
		_SC_NPROCESSORS_ONLN,
		_SC_OPEN_MAX,
		_SC_PAGESIZE,
		_SC_PAGE_SIZE,
		_SC_PASS_MAX,
		_SC_PHYS_PAGES,
		_SC_PRIORITIZED_IO,
		_SC_PRIORITY_SCHEDULING,
		_SC_REALTIME_SIGNALS,
		_SC_RE_DUP_MAX,
		_SC_RTSIG_MAX,
		_SC_SAVED_IDS,
		_SC_SEMAPHORES,
		_SC_SEM_NSEMS_MAX,
		_SC_SEM_VALUE_MAX,
		_SC_SHARED_MEMORY_OBJECTS,
		_SC_SIGQUEUE_MAX,
		_SC_STREAM_MAX,
		_SC_SYNCHRONIZED_IO,
		_SC_THREADS,
		_SC_THREAD_ATTR_STACKADDR,
		_SC_THREAD_ATTR_STACKSIZE,
		_SC_THREAD_DESTRUCTOR_ITERATIONS,
		_SC_THREAD_KEYS_MAX,
		_SC_THREAD_PRIORITY_SCHEDULING,
		_SC_THREAD_PRIO_INHERIT,
		_SC_THREAD_PRIO_PROTECT,
		_SC_THREAD_SAFE_FUNCTIONS,
		_SC_THREAD_STACK_MIN,
		_SC_THREAD_THREADS_MAX,
		_SC_TIMERS,
		_SC_TIMER_MAX,
		_SC_TTY_NAME_MAX,
		_SC_TZNAME_MAX,
		_SC_VERSION,
		_SC_XBS5_ILP32_OFF32,
		_SC_XBS5_ILP32_OFFBIG,
		_SC_XBS5_LP64_OFF64,
		_SC_XBS5_LPBIG_OFFBIG,
		_SC_XOPEN_CRYPT,
		_SC_XOPEN_ENH_I18N,
		_SC_XOPEN_LEGACY,
		_SC_XOPEN_REALTIME,
		_SC_XOPEN_REALTIME_THREADS,
		_SC_XOPEN_SHM,
		_SC_XOPEN_UNIX,
		_SC_XOPEN_VERSION,
		_SC_XOPEN_XCU_VERSION;
	}
}







//main();
		/*Class unsafe_class = Class.forName("sun.misc.Unsafe");
		 Field theUnsafe = unsafe_class.getDeclaredField("theUnsafe");
		 theUnsafe.setAccessible(true);
		 Object instance = theUnsafe.get(null);
		 Method unsafe_declared_methods[] = unsafe_class.getDeclaredMethods();
		 Method unsafe_methods[] = unsafe_class.getMethods();

		 Method allocateInstance = unsafe_class.getDeclaredMethod("allocateInstance", Class.class);
		 //String s = (String) allocateInstance.invoke(instance, String.class);

		 Class<?> pmsc = Class.forName("com.android.server.power.PowerManagerService");
		 Constructor<?> pmscc = pmsc.getConstructor();
		 pmscc.setAccessible(true);
		 Object pmso = pmscc.newInstance();



		 Class<?> atc = Class.forName("android.app.ActivityThread");
		 Method currentApp = atc.getDeclaredMethod("currentApplication");
		 currentApp.setAccessible(true);
		 Object app = currentApp.invoke(null);


		 Class<?> appc = Class.forName("android.content.Context");
		 Method appContext = app.getClass().getMethod("getApplicationContext");
		 appContext.setAccessible(true);
		 Object context = appContext.invoke(app);


		 Class<?> looperc = Class.forName("android.os.Looper");
		 Method getMainLooper = looperc.getDeclaredMethod("getMainLooper");
		 getMainLooper.setAccessible(true);
		 Method looperPrepare = looperc.getDeclaredMethod("prepare");
		 looperPrepare.setAccessible(true);
		 looperPrepare.invoke(null);
		 Class<?> handlerc = Class.forName("android.os.Handler");
		 Constructor<?> handlercon = handlerc.getConstructor(looperc);
		 handlercon.setAccessible(true);
		 Object mainHandler = handlercon.newInstance(getMainLooper.invoke(null));


		 Class<?> dmsc = Class.forName("com.android.server.display.DisplayManagerService");
		 Constructor<?> dmscc = dmsc.getConstructor(Class.forName("android.content.Context"), mainHandler.getClass());
		 dmscc.setAccessible(true);
		 Object dmso = dmscc.newInstance(context, mainHandler);


		 Class<?> imsc = Class.forName("com.android.server.input.InputManagerService");
		 Constructor<?> imscc = imsc.getConstructor(Class.forName("android.content.Context"), mainHandler.getClass());
		 imscc.setAccessible(true);
		 Object imso = imscc.newInstance(context, mainHandler);
		 */

		/*Class<?> wifimsc = Class.forName("com.android.server.wifi.WifiService");
		 Constructor<?> wifimscc = wifimsc.getConstructor(Class.forName("android.content.Context"));
		 wifimscc.setAccessible(true);
		 Object wifimso = wifimscc.newInstance(context);


		 Class<?> wmsc = Class.forName("com.android.server.wm.WindowManagerService");
		 Method wmain = null;
		 for (Method m : wmsc.getDeclaredMethods()) {
		 if (m.getName().contains("main")) {
		 wmain = m;
		 break;
		 }
		 }

		 wmain.setAccessible(true);*/

		/*try{Object wmsObj = wmain.invoke(null,
		 context,
		 pmso,
		 dmso,
		 imso,
		 mainHandler,
		 false,
		 false, 
		 true);

		 }catch(Exception e){}*/
		/*for (Method m : imsc.getDeclaredMethods())
		 System.out.println(m.toGenericString());
		 Method getCallingUid = imsc.getMethod("sendMotionXY", float.class, float.class);
		 getCallingUid.setAccessible(true);
		 System.out.println(getCallingUid.invoke(imso, 10f, 10f));*/
		
